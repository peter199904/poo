public class Hexagono extends Poligono implements PoligonoInterface{
    private float lado;
    private float apotema;

    public Hexagono(){
        setName("Hexagono");
        setNumeroLados(6);
        setNumeroDiagonais(9);
        setNumeroVertices(6);
        setAnguloInterno(120);
    }
    @Override
    public void pintar() {
        System.out.println(getName());

    }
    @Override
    public double calcularArea(){
        return 6*lado*apotema/2;
    }
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getApotema() {
        return apotema;
    }
    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
}
