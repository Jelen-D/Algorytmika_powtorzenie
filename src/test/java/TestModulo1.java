public class TestModulo1 {

    public static void main(String[] args) {

        ModuloFromName nameToCheck1 = new ModuloFromName("Dariusz Jelen");
        nameToCheck1.modulo();

        ModuloFromName nameToCheck2 = new ModuloFromName("Zuzanna Nowak");
        nameToCheck2.modulo();

        ModuloFromName nameToCheck3 = new ModuloFromName("aaaa BBBB");
        nameToCheck3.modulo();

        ModuloFromName nameToCheck4 = new ModuloFromName(" ");
        nameToCheck4.modulo();

    }
}
