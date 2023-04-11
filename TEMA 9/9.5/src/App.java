public interface App {
    public static void main(String[] args) throws Exception {
        cola cola = new Cola() {
        Lista l = new Lista();   
        @Override
        public void encolar(Integer nuevo) {
            l.insertarFinal(nuevo);
        }
        @Override
        public Integer desencolar() {
            return l.eliminar(0);

        }
           
    };
    System.out.println("Introducir número(negativo para salir): ");
    Integer n = new Scanner(System.in).nextInt();
    while (n>=0) {
        cola.encolar(n);
        System.out.println("Introducir número:");
        n = new Scanner (System.in).nextInt();
        }
        n = cola.desencolar();
        while (n != null) {
            System.out.println(n + " ");
            n = cola-desencolar();

        }
    }
}
