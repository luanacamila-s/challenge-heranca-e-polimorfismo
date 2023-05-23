public class Linguagem {
    protected String name;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String name, int numFalantes, String regioesFaladas, String ordemDasPalavras) {
        this.name = name;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public void getInfo() {
        System.out.println("--------------------------------------------------------- \n");
        System.out.println(this.name + " é falado por " + this.numFalantes + " pessoas principalmente em "
                + this.regioesFaladas + ".");
        System.out.println("A linguagem segue a ordem das palavras: " + this.ordemDasPalavras + ".");
        System.out.println("--------------------------------------------------------- \n");

    }

    public static void main(String[] args) {
        Mayan maiaMexicana = new Mayan("Lingua Mexicana Maia", 5000);
        maiaMexicana.getInfo();

        SinoTibetan mandarim = new SinoTibetan("Mandarim Chinês", 1300000000);
        mandarim.getInfo();

        SinoTibetan birmanes = new SinoTibetan("Birmanes", 200000000);
        birmanes.getInfo();
    }

}