package hashTable;

import java.security.KeyStore.Entry;
import java.util.LinkedList;

public class hashTableData<K, V> {

    private int size;
    private Entry<K, V>[] table;

    public hashTableData(int size) {
        this.size = size % 211;
        table = new Entry[size];
    }

    public void put(K key, V value) {
        int hash = myHashFunction(key);
        int index = hash % 211;
        Entry<K, V> entry = table[index];
        if (entry == null) {
            table[index] = new Entry<>(key, value);
        } else {
            while (entry.next != null && !entry.key.equals(key)) {
                entry = entry.next;
            }
            if (entry.key.equals(key)) {
                entry.value = value;
            } else {
                entry.next = new Entry<>(key, value);
            }
        }
    }
    

    public V get(K key) {
  		
    	
    	int hash = myHashFunction(key);
        int index = hash % 211;  //size
        Entry<K, V> entry = table[index];

        while (entry != null && !entry.key.equals(key)) {
            entry = entry.next;
        }
        if(entry == null)
        	throw new NullPointerException("Böyle bir değer bulunumadı");
        System.out.println("Komutun Aranan Değeri : 0x" + entry.value);
        return entry != null ? entry.value : null;
    	}
    

    private int myHashFunction(K key) {

        
    	char[] chars = key.toString().toCharArray();
        int hashedDeger = 0;
        int a = 0;
        for (char harf : chars) { // Karakterler üzerinde döngü yap
            a += (int) harf; // Karakterin ASCII değerini al
        }  
        hashedDeger = (3 * a + 7) % 211;
        // Eğer aynı hashedDeger'e sahip başka bir eleman varsa, sonraki boş yere yazılır.
        while (table[hashedDeger % 211] != null && !table[hashedDeger % 211].key.equals(key)) { //211 yerine size vardı değiştirdim
        	hashedDeger++;      
        }
          
        System.out.println("Indis Adresi " + key.toString() + ": " + hashedDeger);
        return hashedDeger;
    }


    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
