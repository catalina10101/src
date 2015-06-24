public class Tipo {

	int num_simbolos;
	Numero[] vector;
	
	public Tipo(int num, Numero[] vec) {
		this.num_simbolos = num;
		this.vector = vec;
	}

	
	public static void main(String[] args) {
		Numero uno= new Numero(1,"I");
		Numero dos= new Numero(2,"II");
		Numero tres= new Numero(3,"III");
		Numero cuatro= new Numero(4,"IV");
		Numero cinco= new Numero(5,"V");
		Numero seis= new Numero(6,"VI");
		Numero siete= new Numero(7,"VII");
		Numero ocho= new Numero(8,"VIII");
		Numero nueve= new Numero(9,"IX");
		Numero diez= new Numero(10,"X");
		Numero cuarenta= new Numero(40,"XL");
		Numero cincuenta= new Numero(50,"L");
		Numero sesenta= new Numero(60,"LX");
		Numero setenta= new Numero(70,"LXX");
		Numero ochenta= new Numero(80,"LXXX");
		Numero noventa= new Numero(90,"XC");
		Numero cien= new Numero(100,"C");
		Numero cuatrocientos= new Numero(400,"CD");
		Numero quinientos= new Numero(500,"D");
		Numero seicientos= new Numero(600,"DC");
		Numero setecientos= new Numero(700,"DCC");
		Numero ochocientos= new Numero(800,"DCCC");
		Numero novecientos= new Numero(900,"CM");
		Numero mil= new Numero(1000,"M");
		
		Numero[] vec={uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,cuarenta,cincuenta,sesenta,setenta, ochenta, noventa,
				cien,cuatrocientos,quinientos,seicientos, setecientos, ochocientos, novecientos, mil};
		
		
		Tipo Romanos = new Tipo(24,vec);
		
		int pruebas[]= {2015, 23, 3589,348,856};
		Numero n;
		for(int y=0; y<5; y++){
			n=new Numero(pruebas[y],Romanos);
			n.printnum();
		}
		
		
	}
}
/*
2015: MMXV
23: XXIII
3589: MMMDLXXXIX
348: CCCXLVIII
856: DCCCLVI
*/
