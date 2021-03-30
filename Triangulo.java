public class Triangulo extends Poligono implements PoligonoInterface{
    private float base;
    private float altura;
    public Triangulo(){
        setName("Triangulo");
        setNumeroLados(3);
        setNumeroDiagonais(0);
        setNumeroVertices(3);
        setAnguloInterno(60);
    }
    @Override
    public void pintar() {
        System.out.println(getName());
    }
    @Override
    public double calcularArea(){
        return base*altura/2;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
