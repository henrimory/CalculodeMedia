package calculodemedia;

public class Aluno {
    //atributos da classe
    private String nome;
    private int idade; 
    private char sexo;
    private int matricula;
    private String curso;
    private String rg;
    private String endereco;
    private String telefone;
    private static int qtde = 2;
    
    //métodos construtores
    public Aluno(String nome, int idade, char sexo, int matricula, String curso, String rg, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    void cadastro(){
        System.out.println("Aluno " + this.nome + " tem " + this.idade + " Anos "+" RG " + this.rg) ;
        System.out.println("Ele é do sexo " + this.sexo + " \nSeu telefone é " + this.telefone + " \nEndereço " + this.endereco);
        System.out.println("A matricula é " + this.matricula + " no curso de " + this.curso) ;
    }
    void situacao(){
        System.out.println("O Aluno "+ this.nome + " está aprendendo Java ");
    }
    
    void conclusao(){        
        System.out.println( "O Aluno " + this.nome + " de matricula " + this.matricula + " se prepara para o TCC");
    }
    
    //método para calculo da nota passado na classe de execução
    void calculoMedia(double n1, double n2) {
        double vMedia = (n1+n2)/getQtde(); 
        
         System.out.println("A nota do Aluno " + this.nome+ " é " + vMedia);       
        
        //condiçoes de acordo com a nota
        if (vMedia<=10 && vMedia>=7){
            System.out.println("A situação é:\nAprovado!!!");            
        }else if(vMedia<=5.9 && vMedia>=5){
            System.out.println("A situação é:\nRecuperação!!!");
        }else if (vMedia>=0 && vMedia <=4.9){
            System.out.println("A situação é: \nReprovado!!!");
        }else{
            System.out.println("Valor Inválido!!! Tente Novamente.");
        }
    } 

    
    //encapsulando os campos com getters e seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static int getQtde() {
        return qtde;
    }

    public static void setQtde(int qtde) {
        Aluno.qtde = qtde;
    }   
}
