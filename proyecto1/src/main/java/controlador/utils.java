/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author fi944
 */
public class Utils {

    public static LinkedList<Compra> listSolds = new LinkedList<>();
    public static LinkedList<Departamento> listDepartamento = new LinkedList<>();
    public static LinkedList<Factura> listFactura = new LinkedList<>();
    public static LinkedList<Kiosco> listKiosco = new LinkedList<>();
    public static LinkedList<Municipio> listMucipio = new LinkedList<>();
    public static LinkedList<Region> listReg = new LinkedList<>();
    public static LinkedList<RegionSends> listRegionSolds = new LinkedList<>();
    public static LinkedList<Tarjeta> listCard = new LinkedList<>();
    public static LinkedList<User> listUser = new LinkedList<>();
    public static LinkedList<UserSends> listUserSolds = new LinkedList<>();

    public static void regionSendsOrder(LinkedList<RegionSends> listRegionSolds, LinkedList<Compra> listSolds, LinkedList<Region> listReg) {

        for (int i = 0; i < listReg.size(); i++) {
            RegionSends rS = new RegionSends(listReg.get(i).getNombre(), 0);
            listRegionSolds.add(rS);
        }

        for (int i = 0; i < listSolds.size(); i++) {
            for (int j = 0; j < listRegionSolds.size(); j++) {
                if (listSolds.get(i).getDepartamentoD().getReg().getNombre().equals(listRegionSolds.get(j).getReg())) {
                    int cantidad = listRegionSolds.get(j).getCantidad() + 1;
                    listRegionSolds.get(j).setCantidad(cantidad);
                }
            }
        }

    }

    public static void userSendsOrder(LinkedList<UserSends> listUserSolds, LinkedList<Compra> listSolds, LinkedList<User> listUser) {

        for (int i = 0; i < listUser.size(); i++) {
            UserSends uS = new UserSends(listUser.get(i).getNombre(), listUser.get(i).getApellido(), listUser.get(i).getDpi(), 0);
            listUserSolds.add(uS);
        }

        for (int i = 0; i < listSolds.size(); i++) {
            for (int j = 0; j < listUserSolds.size(); j++) {
                if (listSolds.get(i).getDpi().equals(listUserSolds.get(j).getDpi())) {
                    int cantidad = listUserSolds.get(j).getCantidad() + 1;
                    listUserSolds.get(j).setCantidad(cantidad);
                }
            }
        }

    }

    public static String headCheck(String cod, LinkedList<Compra> listSolds, LinkedList<User> listUser, LinkedList<Factura> listFactura) {
        int index = 0;
        String manda = "";
        String address = "";
        for (int i = 0; i < listSolds.size(); i++) {
            if (listSolds.get(i).getCod().equals(cod)) {
                index = i;
            }
        }

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getDpi().equals(listSolds.get(index).getDpi())) {
                manda = listUser.get(i).getNombre() + " " + listUser.get(i).getApellido();
            }
        }

        for (int i = 0; i < listFactura.size(); i++) {
            if (listFactura.get(i).getDpi().equals(listSolds.get(index).getDpi())) {
                address = listFactura.get(i).getDireccion();
            }
        }

        String encabezado = "<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "    <meta charset='UTF-8'>\n"
                + "    <meta name=\"descripcion\" content=\"FACTURA\" />\n"
                + "    <meta name=\"robots\" content=\"index,follow\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>FACTURA</title>\n"
                + "    <style type=\"text/css\" media=\"screen\">\n"
                + "        *{\n"
                + "            box-sizing: border-box;\n"
                + "            margin: 0;\n"
                + "            padding: 0;\n"
                + "            font-family: Arial, Helvetica, sans-serif;\n"
                + "        }\n"
                + "        html{\n"
                + "            font-size: 62.5%;\n"
                + "        }\n"
                + "        body{\n"
                + "            font-size: 1.6rem;\n"
                + "        }\n"
                + "        header{\n"
                + "            display: flex;\n"
                + "            justify-content: center;\n"
                + "        }\n"
                + "        table{\n"
                + "            margin: 10px;\n"
                + "            padding: 5px;\n"
                + "            border-spacing: 30px;\n"
                + "            border-collapse: collapse;\n"
                + "        }\n"
                + "        .tableCheck {\n"
                + "            width: 75%;\n"
                + "        }\n"
                + "        .titleTable {\n"
                + "            text-align: center;\n"
                + "            color: #002D62;\n"
                + "            font-size: 1.5rem;\n"
                + "        }\n"
                + "        .infoTable {\n"
                + "            text-align: left;\n"
                + "        }\n"
                + "        .imgTable {\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "        main {\n"
                + "            display: flex;\n"
                + "            justify-content: center;\n"
                + "        }\n"
                + "        .productTable{\n"
                + "            border-collapse: collapse;\n"
                + "            margin: 25px 0;\n"
                + "            min-width: 200px;\n"
                + "            width: 50%;\n"
                + "        }\n"
                + "        .productTable thead tr {\n"
                + "            background-color: #002D62;\n"
                + "            color: #ffffff;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "        .productTable th, .productTable td {\n"
                + "            padding: 12px 15px;\n"
                + "        }\n"
                + "        .productTable tbody tr {\n"
                + "            border-bottom: 1px solid #dddddd;\n"
                + "        }\n"
                + "        .productTable tbody tr:nth-of-type(even){\n"
                + "            background-color: #f3f3f3;\n"
                + "        }\n"
                + "        footer{\n"
                + "            display: flex;\n"
                + "            justify-content: center;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>";

        String body = "<body>\n"
                + "    <header>\n"
                + "        <table class=\"tableCheck\">\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">NUMERO FACTURA</td>\n"
                + "                <td class=\"infoTable\">" + index + "</td>\n"
                + "                <td width=\"300\" class=\"imgTable\">\n"
                + "                    <section>\n"
                + "                        <figure>\n"
                + "                            <!--  -->\n"
                + "                            <img width=\"300\" height=\"150\" src=\"C:\\Users\\fi944\\OneDrive\\Escritorio\\Universidad\\IPC1\\delivery.png\" alt=\"LOGO USAC DELIVERY\">\n"
                + "                        </figure>\n"
                + "                    </section>\n"
                + "                </td>\n"
                + "                <td class=\"titleTable\">CODIGO</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getCod() + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">ORIGEN</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getDepartamentoO().getName() + ", " + listSolds.get(index).getMunicipioO().getName() + ", " + listSolds.get(index).getDireccionO() + "</td>\n"
                + "                <td></td>\n"
                + "                <td class=\"titleTable\">DESTINO</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getDepartamentoD().getName() + ", " + listSolds.get(index).getMunicipioD().getName() + ", " + listSolds.get(index).getDireccionD() + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">NIT</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getFacturacion() + "</td>\n"
                + "                <td></td>\n"
                + "                <td class=\"titleTable\">TIPO DE PAGO</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getTypePay() + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">NOMBRE</td>\n"
                + "                <td class=\"infoTable\">" + manda + "</td>\n"
                + "                <td></td>\n"
                + "                <td class=\"titleTable\">DIRECCION</td>\n"
                + "                <td class=\"infoTable\">" + address + "</td>\n"
                + "            </tr>\n"
                + "        </table>\n"
                + "    </header>";

        String table = "<main>\n"
                + "        <table class=\"productTable\">\n"
                + "            <thead>\n"
                + "                <tr>\n"
                + "                    <th>TAMANO</th>\n"
                + "                    <th>CANTIDAD</th>\n"
                + "                    <th>TOTAL</th>\n"
                + "                </tr>\n"
                + "            </thead>\n"
                + "            <tbody>\n"
                + "                <tr>\n"
                + "                    <td>" + listSolds.get(index).getSizepackage() + "</td>\n"
                + "                    <td>" + listSolds.get(index).getCantidadPaquetes() + "</td>\n"
                + "                    <td>" + listSolds.get(index).getTotal() + " </td>\n"
                + "                </tr>\n"
                + "            </tbody>\n"
                + "        </table>\n"
                + "    </main>";

        String footer = "<footer>\n"
                + "        <p> EMITADA POR: USAC DELIVERY </p>\n"
                + "    </footer>\n"
                + "</body>\n"
                + "</html>";
        return encabezado + body + table + footer;
    }

    public static String guidePack(String cod, LinkedList<Compra> listSolds, LinkedList<User> listUser) {
        int index = 0;
        String manda = "";
        for (int i = 0; i < listSolds.size(); i++) {
            if (listSolds.get(i).getCod().equals(cod)) {
                index = i;
            }
        }
        LocalDate myObj = LocalDate.now();
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getDpi().equals(listSolds.get(index).getDpi())) {
                manda = listUser.get(i).getNombre() + " " + listUser.get(i).getApellido();
            }
        }
        String texto = "<!DOCTYPE html>\n"
                + "<html lang='es'>\n"
                + "<head>\n"
                + "    <meta charset='UTF-8'>\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>GUIA</title>\n"
                + "    <style type=\"text/css\" media=\"screen\">\n"
                + "        *{\n"
                + "            box-sizing: border-box;\n"
                + "            margin: 0;\n"
                + "            padding: 0;\n"
                + "            font-family: Arial, Helvetica, sans-serif;\n"
                + "        }\n"
                + "        html{\n"
                + "            font-size: 62.5%;\n"
                + "        }\n"
                + "        body{\n"
                + "            font-size: 1.6rem;\n"
                + "        }\n"
                + "        header{\n"
                + "            justify-content: center;\n"
                + "            display: grid;\n"
                + "            grid-gap: 35px;\n"
                + "            grid-template-columns: 220px 220px;\n"
                + "            grid-auto-rows: 220px;\n"
                + "            width: 90%;\n"
                + "        }\n"
                + "        .titleTable {\n"
                + "            text-align: left;\n"
                + "            color: #002D62;\n"
                + "            font-size: 1.5rem;\n"
                + "        }\n"
                + "        .infoTable {\n"
                + "            text-align: left;\n"
                + "        }\n"
                + "        main {\n"
                + "            display: grid;\n"
                + "            justify-content: center;\n"
                + "            grid-row: auto;\n"
                + "        }\n"
                + "        .productTable{\n"
                + "            border-collapse: collapse;\n"
                + "            margin: 25px 0;\n"
                + "            min-width: 200px;\n"
                + "            width: 100%;\n"
                + "        }\n"
                + "        .productTable thead tr {\n"
                + "            background-color: #002D62;\n"
                + "            color: #ffffff;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "        .productTable th, .productTable td {\n"
                + "            padding: 12px 15px;\n"
                + "        }\n"
                + "        .productTable tbody tr {\n"
                + "            border-bottom: 1px solid #dddddd;\n"
                + "        }\n"
                + "        .productTable tbody tr:nth-of-type(even){\n"
                + "            background-color: #f3f3f3;\n"
                + "        }\n"
                + "        footer{\n"
                + "            display: flex;\n"
                + "            justify-content: center;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <header>\n"
                + "        <table class=\"tableCheck\">\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">CODIGO PAQUETE</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getCod() + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">ORIGEN</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getDepartamentoO().getName() + ", " + listSolds.get(index).getMunicipioO().getName() + ", " + listSolds.get(index).getDireccionO() + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">MANDA</td>\n"
                + "                <td class=\"infoTable\">" + manda + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">DESTINO</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getDepartamentoD().getName() + ", " + listSolds.get(index).getMunicipioD().getName() + ", " + listSolds.get(index).getDireccionD() + "</td>\n"
                + "            </tr>\n"
                + "            <tr>\n"
                + "                <td class=\"titleTable\">RECIBE</td>\n"
                + "                <td class=\"infoTable\">" + listSolds.get(index).getDestinatario() + "</td>\n"
                + "            </tr>\n"
                + "        </table>\n"
                + "        <section>\n"
                + "            <figure>\n"
                + "                <img width=\"300\" height=\"150\" src=\"C:\\Users\\fi944\\OneDrive\\Escritorio\\Universidad\\IPC1\\delivery.png\" alt=\"LOGO USAC DELIVERY\">\n"
                + "            </figure>\n"
                + "        </section>\n"
                + "    </header>\n"
                + "    <main>\n"
                + "        <table class=\"productTable\">\n"
                + "            <thead>\n"
                + "                <tr>\n"
                + "                    <th>TAMANO</th>\n"
                + "                    <th>CANTIDAD</th>\n"
                + "                    <th>FECHA DE ENVIO</th>\n"
                + "                    <th>TOTAL</th>\n"
                + "                </tr>\n"
                + "            </thead>\n"
                + "            <tbody>\n"
                + "                <tr>\n"
                + "                    <td>" + listSolds.get(index).getSizepackage() + "</td>\n"
                + "                    <td>" + listSolds.get(index).getCantidadPaquetes() + "</td>\n"
                + "                    <td>" + myObj.toString() + "</td>\n"
                + "                    <td>" + listSolds.get(index).getTotal() + " </td>\n"
                + "                </tr>\n"
                + "            </tbody>\n"
                + "        </table>\n"
                + "        <section>\n"
                + "            <figure>\n"
                + "                <img width=\"500\" height=\"150\" src=\"C:\\Users\\fi944\\OneDrive\\Escritorio\\Universidad\\IPC1\\codbarras.jpg\" alt=\"CODIGO DE BARRAS DEL DELIVERY\">\n"
                + "            </figure>\n"
                + "        </section>\n"
                + "    </main>\n"
                + "    <footer>\n"
                + "        <p class=\"titleTable\"> EMITADA POR: USAC DELIVERY </p>\n"
                + "    </footer>\n"
                + "</body>\n"
                + "</html>";
        return texto;
    }

}
