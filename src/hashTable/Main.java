package hashTable;

import hashTable.hashTableData;

public class Main {
	public static void main(String[] args) {
			
		// BZK.SAU.FPG komutlarını ve makine karşılıklarını hashTablosuna nesnesine ekleme
		hashTableData<String, String> hashTablosu = hashTablosunaEkle(); 
		
		//Komutları çağırarak hash tablosundan makine karşılıklarına ulaşma
		hashTablosundanAl(hashTablosu);

	}  
	
	public static void hashTablosundanAl(hashTableData<String, String> hashTablo) {
		
		hashTableData<String, String> myHashTable = hashTablo;
		
 	    System.out.println("\nADD komutu");
		myHashTable.get("ADD #");
		myHashTable.get("ADD $");  
		myHashTable.get("ADD @"); 
		myHashTable.get("ADD %"); 
		
		System.out.println("\nADDC komutu");
		myHashTable.get("ADDC #");
		myHashTable.get("ADDC $");  
		myHashTable.get("ADDC @"); 
		myHashTable.get("ADDC %"); 		
		
		System.out.println("\nAND komutu");
		myHashTable.get("AND #");
		myHashTable.get("AND $");  
		myHashTable.get("AND @"); 
		myHashTable.get("AND %"); 
		
		System.out.println("\nCMP komutu");
		myHashTable.get("CMP #");
		myHashTable.get("CMP $");  
		myHashTable.get("CMP @"); 
		myHashTable.get("CMP %"); 
		
		System.out.println("\nDIV komutu");
		myHashTable.get("DIV #");
		myHashTable.get("DIV $");  
		myHashTable.get("DIV @"); 
		myHashTable.get("DIV %");
		
		System.out.println("\nXOR komutu");
		myHashTable.get("XOR #");
		myHashTable.get("XOR $");  
		myHashTable.get("XOR @"); 
		myHashTable.get("XOR %"); 
		
		System.out.println("\nLDA komutu");
		myHashTable.get("LDA #");
		myHashTable.get("LDA $");  
		myHashTable.get("LDA @"); 
		
		System.out.println("\nOR komutu");
		myHashTable.get("OR #");
		myHashTable.get("OR $");  
		myHashTable.get("OR @"); 
		myHashTable.get("OR %"); 	
		
		System.out.println("\nSUB komutu");
		myHashTable.get("SUB #");
		myHashTable.get("SUB $");  
		myHashTable.get("SUB @"); 
		myHashTable.get("SUB %"); 		
		
		System.out.println("\nSUBC komutu");
		myHashTable.get("SUBC #");
		myHashTable.get("SUBC $");  
		myHashTable.get("SUBC @"); 
		myHashTable.get("SUBC %"); 	
		
		System.out.println("\nLDAX komutu");
		myHashTable.get("LDAX #");
		myHashTable.get("LDAX $");  
		myHashTable.get("LDAX @"); 
		myHashTable.get("LDAX %"); 	
		
		System.out.println("\nLDAS komutu");
		myHashTable.get("LDAS #");
		myHashTable.get("LDAS $");  
		myHashTable.get("LDAS @"); 
		myHashTable.get("LDAS %"); 		
		
		System.out.println("\nMUL komutu");
		myHashTable.get("MUL #");
		myHashTable.get("MUL $");  
		myHashTable.get("MUL @"); 
		myHashTable.get("MUL %");  
		
		System.out.println("\nCLR komutu");
		myHashTable.get("CLR");

		System.out.println("\nDECR komutu");
		myHashTable.get("DECR"); 

		System.out.println("\nINCR komutu");
		myHashTable.get("INCR"); 

		System.out.println("\nCOM komutu");
		myHashTable.get("COM");  

		System.out.println("\nNEG komutu");
		myHashTable.get("NEG"); 

		System.out.println("\nPSH komutu");
		myHashTable.get("PSH"); 

		System.out.println("\nPUL komutu");
		myHashTable.get("PUL");  

		System.out.println("\nSAR komutu");
		myHashTable.get("SAR");  

		System.out.println("\nSAL komutu");
		myHashTable.get("SAL"); 

		System.out.println("\nDECX komutu");
		myHashTable.get("DECX"); 

		System.out.println("\nINCX komutu");
		myHashTable.get("INCX"); 

		System.out.println("\nDECS komutu");
		myHashTable.get("DECS");

		System.out.println("\nINCS komutu");
		myHashTable.get("INCS"); 

		System.out.println("\nHLT komutu");
		myHashTable.get("HLT");  

		System.out.println("\nIN komutu");
		myHashTable.get("IN"); 

		System.out.println("\nOUT komutu");
		myHashTable.get("OUT");
		
		System.out.println("\nRTI komutu");
		myHashTable.get("RTI"); 

		System.out.println("\nRTS komutu");
		myHashTable.get("RTS"); 
		
		System.out.println("\nCLC komutu");
		myHashTable.get("CLC");   

		System.out.println("\nCLI komutu");
		myHashTable.get("CLI"); 

		System.out.println("\nCLV komutu");
		myHashTable.get("CLV");  

		System.out.println("\nSTC komutu");
		myHashTable.get("STC"); 

		System.out.println("\nSTI komutu");
		myHashTable.get("STI");  

		System.out.println("\nSTV komutu");
		myHashTable.get("STV"); 

		System.out.println("\nNOP komutu");
		myHashTable.get("NOP");
		
		System.out.println("\nBRA * komutu");
		myHashTable.get("BRA *");  

		System.out.println("\nBCC * komutu");
		myHashTable.get("BCC *");   

		System.out.println("\nBCS * komutu");
		myHashTable.get("BCS *");  

		System.out.println("\nBZR * komutu");
		myHashTable.get("BZR *");  

		System.out.println("\nBGE * komutu");
		myHashTable.get("BGE *");  

		System.out.println("\nBGR * komutu");
		myHashTable.get("BGR *");  

		System.out.println("\nBHI * komutu");
		myHashTable.get("BHI *");  

		System.out.println("\nBLE * komutu");
		myHashTable.get("BLE *");  

		System.out.println("\nBLS * komutu");
		myHashTable.get("BLS *");  

		System.out.println("\nBLT * komutu");
		myHashTable.get("BLT *");  

		System.out.println("\nBMI * komutu");
		myHashTable.get("BMI *"); 

		System.out.println("\nBNE * komutu");
		myHashTable.get("BNE *"); 

		System.out.println("\nBVC * komutu");
		myHashTable.get("BVC *"); 

		System.out.println("\nBVS * komutu");
		myHashTable.get("BVS *");  

		System.out.println("\nBPL * komutu");
		myHashTable.get("BPL *");  

		System.out.println("\nBSR * komutu");
		myHashTable.get("BSR *");  
		
		System.out.println("\nSTA  komutu");
		myHashTable.get("STA $");   
		myHashTable.get("STA @");  
		myHashTable.get("STA %");   
		
		System.out.println("\nSTAX  komutu");
		myHashTable.get("STAX $"); 
		myHashTable.get("STAX @");  
		
		System.out.println("\nSTAS  komutu");
		myHashTable.get("STAS $");   
		myHashTable.get("STAS @"); 
		
		System.out.println("\nJMP  komutu");
		myHashTable.get("JMP $"); 
		myHashTable.get("JMP @"); 
		myHashTable.get("JMP %");  
		
		System.out.println("\nJSR  komutu");
		myHashTable.get("JSR $"); 
		myHashTable.get("JSR %"); 
		
		System.out.println("\nBPO *  komutu");
		myHashTable.get("BPO *");
		
		System.out.println("\nBPE *  komutu");
		myHashTable.get("BPE *");
	}
	
	public static hashTableData<String, String> hashTablosunaEkle() {
		hashTableData<String, String> myHashTable = new hashTableData<>(211);
		
		myHashTable.put("ADD #", "1000");
		myHashTable.put("ADD $", "2000");  
		myHashTable.put("ADD @", "3000"); 
		myHashTable.put("ADD %", "4000"); 

		myHashTable.put("ADDC #", "1001");  
		myHashTable.put("ADDC $", "2001");  
		myHashTable.put("ADDC @", "3001");  
		myHashTable.put("ADDC %", "4001"); 
		
		myHashTable.put("AND #", "1002"); 
		myHashTable.put("AND $", "2002"); 
		myHashTable.put("AND @", "3002");  
		myHashTable.put("AND %", "4002"); 

		myHashTable.put("CMP #", "1004"); 
		myHashTable.put("CMP $", "2004"); 
		myHashTable.put("CMP @", "3004"); 
		myHashTable.put("CMP %", "4004");  

		myHashTable.put("DIV #", "1006"); 
		myHashTable.put("DIV $", "2006"); 
		myHashTable.put("DIV @", "3006"); 
		myHashTable.put("DIV %", "4006");

		myHashTable.put("XOR #", "1007"); 
		myHashTable.put("XOR $", "2007"); 
		myHashTable.put("XOR @", "3007"); 
		myHashTable.put("XOR %", "4007"); 

		myHashTable.put("LDA #", "100B"); 
		myHashTable.put("LDA $", "200B"); 
		myHashTable.put("LDA @", "300B");  

		myHashTable.put("OR #", "100C"); 
		myHashTable.put("OR $", "200C");
		myHashTable.put("OR @", "300C"); 
		myHashTable.put("OR %", "400C"); 

		myHashTable.put("SUB #", "1011"); 
		myHashTable.put("SUB $", "2011"); 
		myHashTable.put("SUB @", "3011"); 
		myHashTable.put("SUB %", "4011");  

		myHashTable.put("SUBC #", "1012");
		myHashTable.put("SUBC $", "2012"); 
		myHashTable.put("SUBC @", "3012"); 
		myHashTable.put("SUBC %", "4012"); 

		myHashTable.put("LDAX #", "1015"); 
		myHashTable.put("LDAX $", "2016"); 
		myHashTable.put("LDAX @", "3015"); 
		myHashTable.put("LDAX %", "4015"); 

		myHashTable.put("LDAS #", "1016"); 
		myHashTable.put("LDAS $", "2016");  
		myHashTable.put("LDAS @", "3016");
		myHashTable.put("LDAS %", "4016"); 

		myHashTable.put("MUL #", "1014"); 
		myHashTable.put("MUL $", "2014");  
		myHashTable.put("MUL @", "3014"); 
		myHashTable.put("MUL %", "4014");
		
		myHashTable.put("CLR", "0003");

		myHashTable.put("DECR", "0005"); 

		myHashTable.put("INCR", "0008"); 

		myHashTable.put("COM", "0009");  

		myHashTable.put("NEG", "000A"); 

		myHashTable.put("PSH", "000D"); 

		myHashTable.put("PUL", "000E");  

		myHashTable.put("SAR", "000F");  

		myHashTable.put("SAL", "0010"); 

		myHashTable.put("DECX", "0019"); 

		myHashTable.put("INCX", "001A"); 

		myHashTable.put("DECS", "001B");

		myHashTable.put("INCS", "001C"); 

		myHashTable.put("HLT", "0032");  

		myHashTable.put("IN", "0039"); 

		myHashTable.put("OUT", "003A");
		
		myHashTable.put("RTI", "0030"); 

		myHashTable.put("RTS", "002D"); 
		
		myHashTable.put("CLC", "0033");   

		myHashTable.put("CLI", "0034"); 

		myHashTable.put("CLV", "0035");  

		myHashTable.put("STC", "0036"); 

		myHashTable.put("STI", "0037");  

		myHashTable.put("STV", "0038"); 

		myHashTable.put("NOP", "0031");
		
		myHashTable.put("BRA *", "501D");  

		myHashTable.put("BCC *", "501E");   

		myHashTable.put("BCS *", "501F");  

		myHashTable.put("BZR *", "5020");  

		myHashTable.put("BGE *", "5021");  

		myHashTable.put("BGR *", "5022");  

		myHashTable.put("BHI *", "5023");  

		myHashTable.put("BLE *", "5024");  

		myHashTable.put("BLS *", "5025");  

		myHashTable.put("BLT *", "5026");  

		myHashTable.put("BMI *", "5027"); 

		myHashTable.put("BNE *", "5028"); 

		myHashTable.put("BVC *", "5029"); 

		myHashTable.put("BVS *", "502A");  

		myHashTable.put("BPL *", "502B");  

		myHashTable.put("BSR *", "502C");  
		
		myHashTable.put("STA $", "2013");   
		myHashTable.put("STA @", "3013");  
		myHashTable.put("STA %", "4013");   
		
		myHashTable.put("STAX $", "2017"); 
		myHashTable.put("STAX @", "3017");  

		myHashTable.put("STAS $", "2018");   
		myHashTable.put("STAS @", "3018"); 

		myHashTable.put("JMP $", "102E"); 
		myHashTable.put("JMP @", "202E"); 
		myHashTable.put("JMP %", "402E");  

		myHashTable.put("JSR $", "102F"); 
		myHashTable.put("JSR %", "402F"); 
		
		myHashTable.put("BPO *", "502D");

		myHashTable.put("BPE *", "502E");
		
		return myHashTable;
	}
}
