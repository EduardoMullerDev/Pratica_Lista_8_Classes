package Ex09PontoeRetangulo;

public class ponto {
    private int x;
    private int y;

    public ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Coordenadas do ponto: (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}