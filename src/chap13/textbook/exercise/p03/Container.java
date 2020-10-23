package chap13.textbook.exercise.p03;

public class Container<K, V> {
	private K key;
	private V value;
	
	
	public void setKey(K key) {this.key = key;}
	public void setValue(V value) {this.value = value;}

	public K getKey() {return key;}
	public V getValue() {return value;}
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
		
	}

}