public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;
    private double taxaDeUso;

    public ContaBancaria(double saldoInicial) {
        this.setSaldo(saldoInicial);
        if (this.getSaldo() <= 500) {
            this.setLimiteChequeEspecial(50);
        } else {
            this.setLimiteChequeEspecial(this.getSaldo() * 0.5);
        }
        this.setChequeEspecial(this.getLimiteChequeEspecial());
    }

    public void exibirSaldoEChequeEspecial() {
        if (this.getChequeEspecial() <= 0) {
            System.out.println("O valor ultrapassa seu limite do cheque especial.");
        } else {
            System.out.println("Seu saldo é R$" + this.getSaldo());
            System.out.println("Seu cheque especial R$" + this.getChequeEspecial());
        }
    }

    public void depositarDinheiro(double dinheiro) {
        double faltaParaCompletar = this.getLimiteChequeEspecial() - this.getChequeEspecial();
        if (dinheiro <= faltaParaCompletar) {
            this.setChequeEspecial(this.getChequeEspecial() + dinheiro);
        } else {
            this.setChequeEspecial(this.getLimiteChequeEspecial());
            this.setSaldo(this.getSaldo() + (dinheiro - faltaParaCompletar));
        }
        System.out.println("O valor depositado é R$" + dinheiro);
    }

    public void sacarDinheiro(double dinheiro) {
        if (dinheiro <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - dinheiro);
            System.out.println("O valor sacado é R$" + dinheiro);
        } else if (dinheiro <= (this.getSaldo() + this.getChequeEspecial())) {
            double restante = dinheiro - this.getSaldo();
            this.setSaldo(0);
            this.setChequeEspecial(this.getChequeEspecial() - restante);
            taxaUsoChequeEspecial();
            if (this.getChequeEspecial() <= 0) {
                this.setTaxaDeUso(this.getTaxaDeUso() - this.getChequeEspecial());
            } else {
                System.out.println("O valor sacado é R$" + dinheiro);
            }
        } else {
            System.out.println("Você ultrapassou o limite disponível.");
        }
    }

    public void pagarBoleto(double dinheiro) {
        sacarDinheiro(dinheiro);
        System.out.println("Pagamento do boleto no valor de R$" + dinheiro);
    }

    public void chequeEspecialEmUso() {
        System.out.println("O limite do seu cheque especial é R$" + this.getLimiteChequeEspecial() +
                " e o valor disponível é R$" + this.getChequeEspecial());
    }

    private void taxaUsoChequeEspecial() {
        if (this.getLimiteChequeEspecial() > this.getChequeEspecial()) {
            this.setTaxaDeUso((this.getLimiteChequeEspecial() - this.getChequeEspecial()) * 0.2);
            this.setChequeEspecial(this.getChequeEspecial() - this.getTaxaDeUso());
            System.out.println("Ultrapassou seu saldo. Taxa de uso aplicada R$" + this.getTaxaDeUso());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTaxaDeUso() {
        return taxaDeUso;
    }

    public void setTaxaDeUso(double taxaDeUso) {
        this.taxaDeUso = taxaDeUso;
    }
}
