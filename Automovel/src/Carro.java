public class Carro {
    private boolean ligado;
    private int velocidade;
    private int velocidadeFinal;
    private String marcha;
    private boolean virar;


    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = marcha;
    }

    public void ligarCarro() {
        if (this.velocidade == 0) {
            setLigado(true);
            setMarcha("Neutro");
            System.out.println("Carro ligado");
        }
    }

    public void desligarCarro() {
        if (this.velocidade <= 0) {
            setLigado(false);
            setMarcha("Neutro");
            System.out.println("Carro desligado");
        }
    }

    public void acelerarCarro() {
        setLigado(true);
        for (this.velocidade = 0; this.velocidade <= 120; this.velocidade++) {
            trocarMarchas();
            velocidadeAtual();
        }
        this.velocidadeFinal = this.velocidade - 1;
    }


    public void desacelerarCarro() {
        if (this.getVelocidadeFinal() == 120) {
            for (this.velocidade = 120; this.velocidade >= 0; this.velocidade--) {
                trocarMarchas();
                velocidadeAtual();
            }
        } else {
            System.out.println("Não atingiu velocidade suficiente");
        }

    }

    public void manobrar(boolean virar){

    }

    public void virarEsquerda() {
        if (this.velocidade == 0) {
            System.out.println("Impossível manobrar parado");
        } else if (this.velocidade <= 40) {
            System.out.println("Virando para esquerda");
            setVirar(true);
        } else {
            System.out.println("Reduza a velocidade para poder virar");
        }
    }

    public void virarDireita() {
        if (this.velocidade == 0) {
            System.out.println("Impossível manobrar parado");
        } else if (this.velocidade <= 40) {
            this.setVirar(true);
            System.out.println("Virando para esquerda");

        } else {
            System.out.println("Reduza a velocidade para poder virar");
        }
    }

    public void velocidadeAtual() {
        System.out.println("== " + this.velocidade + "KM/H == " + this.marcha + " ==");
    }


    public void trocarMarchas() {

        if (this.velocidade == 0) {
            this.marcha = "Neutro";
        } else if (this.velocidade <= 20) {
            this.marcha = "1a Marcha";
        } else if (this.velocidade <= 40) {
            this.marcha = "2a Marcha";
        } else if (this.velocidade <= 60) {
            this.marcha = "3a Marcha";
        } else if (this.velocidade <= 80) {
            this.marcha = "4a Marcha";
        } else if (this.velocidade <= 100) {
            this.marcha = "5a Marcha";
        } else if (this.velocidade <= 120) {
            this.marcha = "6a Marcha";
        } else {
            this.marcha = "Neutro";
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        setLigado(true);
        this.velocidade = velocidade;
        trocarMarchas();

        System.out.println("== " + this.velocidade + "KM/H == " + this.marcha + " ==");
    }

    public String getMarcha() {
        return marcha;
    }

    public void setMarcha(String marcha) {
        this.marcha = marcha;
    }

    public boolean isVirar() {
        return virar;
    }

    public void setVirar(boolean virar) {
        this.virar = virar;
    }

    public int getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(int velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }
}

