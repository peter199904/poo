public class Quadrilatero extends Poligono implements PoligonoInterface{
    private float altura;
    public Quadrilatero(){
        setName("Quadrilatero");
        setNumeroLados(4);
        setNumeroDiagonais(2);
        setNumeroVertices(4);
        setAnguloInterno(90);
    }
    @Override
    public void pintar() {
        System.out.println(getName());
    }
    @Override
    public double calcularArea(){
        return altura*altura;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
