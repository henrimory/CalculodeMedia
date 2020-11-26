package calculodemedia;

public class CalculodeMedia {


    public static void main(String[] args) {
        
        // instaciando meus objetos da classe aluno
        Aluno aln1 = new Aluno("Henrique", 35, 'M', 123 ,"Desenvolvimento de Sistemas", "123456789-8", "Rua Jatoba", "4235-8598");
        
        aln1.cadastro();         
        aln1.calculoMedia(8, 9);  
        aln1.situacao();
        aln1.conclusao();          
        
        System.out.println("===============================================================");        
  
        Aluno aln2 = new Aluno("Gabriel", 20, 'M', 124, "Desenvolvimento de Sitemas", "123456987-2", "Rua Quintino", "4235-0000");        
        
        aln2.cadastro();         
        aln2.calculoMedia(5, 5);  
        aln2.situacao();
        aln2.conclusao();       
       
    }
    
}