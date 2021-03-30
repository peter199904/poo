public abstract class Poligono {
    private String name;
    private Integer numeroLados;
    private Integer numeroDiagonais;
    private Integer numeroVertices;
    private float  anguloInterno;

    public abstract double calcularArea();
    public Integer getNumeroLados() {
        return numeroLados;
    }
    public void setNumeroLados(Integer numeroLados) {
        this.numeroLados = numeroLados;
    }
    public float getAnguloInterno() {
        return anguloInterno;
    }
    public void setAnguloInterno(float anguloInterno) {
        this.anguloInterno = anguloInterno;
    }
    public Integer getNumeroDiagonais() {
        return numeroDiagonais;
    }
    public void setNumeroDiagonais(Integer numeroDiagonais) {
        this.numeroDiagonais = numeroDiagonais;
    }
    public Integer getNumeroVertices() {
        return numeroVertices;
    }
    public void setNumeroVertices(Integer numeroVertices) {
        this.numeroVertices = numeroVertices;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}

