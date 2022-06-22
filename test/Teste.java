

import afds.*;


public class Teste {

	private Estado e1, e2, e3, e4;
	private Simbolo s1, s2, s3;
	private TransicaoD t1, t2, t3;
	private ConjuntoConjuntoEstados cce, cce2;
	private ConjuntoEstados ce, ce2;
	private ConjuntoSimbolo csi, csi2;
	private ConjuntoTransicaoD ct, ct2;
	
	public static void main(String[] args) {
		Teste t = new Teste();
	}
	
	public Teste(){
		inicializar();
		testarInclusao();
		testarIgualdade();	
		//testeUniaoIntersecao();
	}
	
	public void inicializar(){
		
		e1 = new Estado("e1");
		e2 = new Estado("e2");
		e3 = new Estado("e3");
		e4 = new Estado("e4");
			
		s1 = new Simbolo('a');
		s2 = new Simbolo('b');
                s3 = new Simbolo('c');
		
		t1 = new TransicaoD();
		t1.setOrigem(e1);
		t1.setSimbolo(s1);
		t1.setDestino(e2);
		
		t2 = new TransicaoD();
		t2.setOrigem(e3);
		t2.setSimbolo(s1);
		t2.setDestino(e2);
		
		t3 = new TransicaoD();
		t3.setOrigem(e2);
		t3.setSimbolo(s2);
		t3.setDestino(e3);
		
		ce = new ConjuntoEstados();
		ce2 = new ConjuntoEstados();
		
		csi = new ConjuntoSimbolo();
		csi2 = new ConjuntoSimbolo();
		
		ct = new ConjuntoTransicaoD();
		ct2 = new ConjuntoTransicaoD();
		
		cce = new ConjuntoConjuntoEstados();
		cce2 = new ConjuntoConjuntoEstados();								
	}
	
	public void testarInclusao(){
		
		ce.inclui(e1);
		ce.inclui(e2);
		ce.inclui(e3);			
		
		ce2.inclui(e1);
		ce2.inclui(e2);
		ce2.inclui(e3);
		ce2.inclui(e4);
		
		csi.inclui(s1);
		csi.inclui(s2);
                csi2.inclui(s3);
		
		ct.inclui(t1);
		ct.inclui(t3);
                ct2.inclui(t2);
		
		cce.inclui(ce);
		cce.inclui(ce2);
                cce2.inclui(ce);
		
		System.out.println("ce:"+ ce +"\nce2:"+ ce2 +"\ncsi:"+ csi +"\nct:"+ ct +"\ncce:"+ cce);
		
	}
	
	public void testeUniaoIntersecao(){
		
		ConjuntoEstados ceTeste = ce.uniao(ce2);		
		System.out.println("ceUce2:"+ ceTeste);
		
		ceTeste = ce.intersecao(ce2);		
		System.out.println("ceIce2:"+ ceTeste);
		
		ConjuntoSimbolo csTeste = csi.uniao(csi2);		
		System.out.println("csiUcsi2:"+ csTeste);
		
		csTeste = csi.intersecao(csi2);		
		System.out.println("csiIcsi2:"+ csTeste);
		
		ConjuntoTransicaoD ctTeste = ct.uniao(ct2);		
		System.out.println("ctUct2:"+ ctTeste);
		
		ctTeste = ct.intersecao(ct2);		
		System.out.println("ctIct2:"+ ctTeste);
		
		ConjuntoConjuntoEstados cceTeste = cce.uniao(cce2);		
		System.out.println("cceUcce2:"+ cceTeste);
		
		cceTeste = cce.intersecao(cce2);		
		System.out.println("cceIcce2:"+ cceTeste);
						
	}
	
	public void testarIgualdade(){
		
		if(ce.igual(ce2)){
			System.out.println("Conjunto de estados iguais");
		}else{
			System.out.println("Conjunto de estados diferentes");
		}
		
		
		if(csi.igual(csi2)){
			System.out.println("Conjunto de simbolos iguais");
		}else{
			System.out.println("Conjunto de simbolos diferentes");
		}
		
		if(ct.igual(ct2)){
			System.out.println("Conjunto de transicaoD iguais");
		}else{
			System.out.println("Conjunto de transicaoD diferentes");
		}
		
		if(cce.igual(cce)){
			System.out.println("ConjuntoConjuntoEstados iguais");
		}else{
			System.out.println("ConjuntoConjuntoEstados diferentes");
		}
		
	}
	
}
