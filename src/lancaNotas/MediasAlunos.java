package lancaNotas;

public class MediasAlunos {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("thiago", 34);
		Aluno aluno2 = new Aluno("Liz Magnolia", 27);
		
		
		NotaProva notaAluno1 = new NotaProva(10,9,9.5,10);
		NotaProva notaAluno2 = new NotaProva(10,10,9.5,10);
	
		 
		
		System.out.println("Aluno "+aluno1.nome+" número "+aluno1.id);
		System.out.println("suas notas são:");
		System.out.println(notaAluno1.nota1+", "+ notaAluno1.nota2+", "+ notaAluno1.nota3+", "+ notaAluno1.nota4 );
		System.out.printf("sua média final é: %.2f", notaAluno1.media());
		
		System.out.println();
		
		System.out.println("Aluno "+aluno2.nome+" número "+aluno2.id);
		System.out.println("suas notas são:");
		System.out.println(notaAluno2.nota1+", "+ notaAluno2.nota2+", "+ notaAluno2.nota3+", "+ notaAluno2.nota4 );
		System.out.printf("sua média final é: %.2f", notaAluno2.media());
		
	}
	
}
