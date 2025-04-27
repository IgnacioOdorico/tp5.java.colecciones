
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("35234", "papas", 5234.34, 45, CategoriaProducto.ALIMENTOS);

        Producto p2 = new Producto("57436","remera",4324.2342, 8, CategoriaProducto.ROPA);

        Producto p3 = new Producto("57465","lampara",566585.8458, 10, CategoriaProducto.HOGAR);

        Inventario tiendaDePepe = new Inventario();
        tiendaDePepe.agregarProducto(p1);
        tiendaDePepe.agregarProducto(p2);
        tiendaDePepe.agregarProducto(p3);
        tiendaDePepe.listarProductos();


        System.out.println(tiendaDePepe.buscarProductoPorId("57436"));
        System.out.println(tiendaDePepe.buscarProductoPorId("30"));

        tiendaDePepe.eliminarProducto("57436");
        tiendaDePepe.listarProductos();
        tiendaDePepe.actualizarStock("57465",11);
        tiendaDePepe.listarProductos();
        System.out.println("----------------------------");
        tiendaDePepe.filtrarPorCategoria(CategoriaProducto.HOGAR);
        System.out.println(tiendaDePepe.obtenerTotalStock());
        System.out.println(tiendaDePepe.obtenerProductoConMayorStock());
        System.out.println("----------------------------------");
        tiendaDePepe.filtrarProductosPorPrecio(3434.324,586565.565656);
        tiendaDePepe.mostrarCategoriasDisponibles();




   


    }
}