
public class Numero {
	int valor;
	String simbolo;

	public Numero(int v, String sim) {
		this.valor = v;
		this.simbolo= sim;
	}
	
	public Numero(int v, Tipo tipo) {
		this.valor = v;
		String num="";
		int veces, residuo=v, i;
		
		for(i=tipo.num_simbolos-1; i>=0;i-- ){
			//System.out.println(tipo.vector[i].valor);
			veces=residuo/(tipo.vector[i].valor);
			residuo= residuo%(tipo.vector[i].valor);
			//System.out.println("veces= " + veces+ ", res= "+ residuo);
			for(int y =1; y<=veces; y++){
				num= num+ tipo.vector[i].simbolo;
			}
			//System.out.println(num);
		}
		
		this.simbolo= num;
	}
	
	public void printnum(){
		System.out.println(this.valor + " " +this.simbolo );
	}

}
