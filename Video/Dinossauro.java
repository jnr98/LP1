class Dinossauro {
    private String especie;

    public Dinossauro(String especie) {
        this.especie = especie;
    }

    public void serAtingido() {
        System.out.println("Os " + especie + " foram extintos pelo meteoro!");
    }
}