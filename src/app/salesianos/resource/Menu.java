package app.salesianos.resource;

public class Menu {
    public String getMenu() {
        String menu = """
                Menú de opciones:
                1. Abrir caja.
                2. Añadir nuevo cliente a la cola.
                3. Atender un cliente.
                4. Ver clientes pendientes.
                5. Cerrar supermercado.
                    """;
        return menu;
    }
}
