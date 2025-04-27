import java.util.ArrayList;

public class Inventario {

    public ArrayList<Producto> listaDeProductos = new ArrayList<>();


    public void agregarProducto(Producto producto){
        listaDeProductos.add(producto);
    }

    public void listarProductos(){
       for (Producto p : listaDeProductos){
           System.out.println(p);
       }
    }


    public Producto buscarProductoPorId(String id){
        for (Producto i : listaDeProductos){
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public void eliminarProducto(String id){
        for(Producto i :listaDeProductos) {
            if (i.getId()==id){
                listaDeProductos.remove(i);

            }


        }

    }


    public void actualizarStock (String id,int nuevaCantidad){
        for(Producto i : listaDeProductos){
            if (i.getId()==id) {
                i.setCantidad(nuevaCantidad);
            }
        }

    }

    public void filtrarPorCategoria(CategoriaProducto categoria){
        for(Producto i : listaDeProductos){
            if(categoria==i.getCategoria()){
                System.out.println(i);
            }
        }
    }

    public int obtenerTotalStock(){
        int d =0;
        for (Producto i : listaDeProductos){
            d = d+i.getCantidad();
        }
        return d;
    }

    public Producto obtenerProductoConMayorStock(){
        int d =0;
        Producto p=null;
        for(Producto i : listaDeProductos){
            if(i.getCantidad()>=d){
                d=i.getCantidad();
                p=i;
            }
        }
        return p;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> p = new ArrayList<>();
        for(Producto i: listaDeProductos){
            if(i.getPrecio()>min && i.getPrecio()<max){
                p.add(i);
            }
        }
        System.out.println(p);
    }

    public void mostrarCategoriasDisponibles(){
        for(Producto i : listaDeProductos){
            System.out.println("CATEGORIA :"+i.getCategoria());
        }
    }



}
