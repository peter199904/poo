public class Pentagono extends Poligono implements PoligonoInterface{
    private float perimetro;
    private float apotema;

    public Pentagono(){
        setName("Pentagono");
        setNumeroLados(5);
        setNumeroDiagonais(5);
        setNumeroVertices(5);
        setAnguloInterno(108);
    }
    @Override
    public void pintar() {
        System.out.println(getName());

    }
    @Override
    public double calcularArea(){
        return perimetro*apotema/2;
    }
    public float getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    public float getApotema() {
        return apotema;
    }
    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
}
