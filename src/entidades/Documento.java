package entidades;

public class Documento {
    private String cpf;
    private String rg;
    private String cnh;

    public Documento(String cpf) {
        if (validaCpf(cpf)){
            System.out.println("CPF VÁLIDO!");
            setCpf(cpf);
        }else{
            System.out.println("CPF INVÁLIDO!");
            System.exit(-1);
        }
    }

    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    private Boolean calculaCPF(String cpf, int posicao){
        int dv = Character.getNumericValue(cpf.charAt(posicao)); 
        int soma=0;
        for (int i = 0; i < cpf.length()-(11-posicao); i++){
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma = soma+digito*((posicao+1)-i);
        }
        int resto = soma%11;
        if ((resto < 2)&&(dv!=0)){
            return false;
        }else if((resto >= 2)&&(dv!=(11-resto))){
            return false;
        }
        return true;
    }
    private Boolean validaCpf(String cpf){
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        int primeiro = Character.getNumericValue(cpf.charAt(0));
        int indice = 0;
        for(int i=1; i < cpf.length();i++){
            indice = Character.getNumericValue(cpf.charAt(i));
            if(primeiro!=indice){
                break;
            }else if(i==11){
                return false;
            }
        }
        return (calculaCPF(cpf, 9)&&(calculaCPF(cpf, 10)));        
    }

    @Override
    public String toString(){
        return "\"documeto\": { \"cnh\": \""+getCnh()+"\""+", "+"\"cpf\": \""+getCpf()+"\""+", "+"\"rg\": \""+getRg()+"\""+"}, "
        ;
    }
}