package Lab3;


	
	

	import java.util.*;
//aa
	public class List<T> {

		private T[] element;
		private int size;

		@SuppressWarnings("unchecked")
		public List(int n) {
			element =(T[])  new Object[n];
		}
		

		public List() {
			this(100);
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public int size() {
			return size;
		}

		public T get(int index) {
			return element[index];
		}

		public void add(int index, T theElement) {
			if (size == element.length) {

			}
			for (int i = size - 1; i >= index; i--)
				element[i + 1] = element[i];
			element[index] = theElement;
			size++;
		}

		public T remove(int index) {
			T removedElement = element[index];
			for (int i = index + 1; i < size; i++) {
				element[i - 1] = element[i];
			}
			element[--size] = null;
			return removedElement;
		}

		public String toString() {
			StringBuffer s = new StringBuffer("[");

			for (int i = 0; i < size; i++)
				if (element[i] == null)
					s.append("null, ");
				else
					s.append(element[i].toString() + ", ");

			if (size > 0)
				s.delete(s.length() - 2, s.length());

			s.append("]");

			return new String(s);
		}

		public int max() {
			int maxValue = (int) this.get(0);
			for (int i = 1; i < size; i++) {
				if (maxValue < (int) element[i]) {
					maxValue = (int) element[i];
				}

			}
			return maxValue;
		}

		public static void main(String[] args) {
			
	// TODO Auto-generated method stub
			System.out.println("Команд:");
			System.out.println("\t1. isEmpty\n\t2. size \n\t3. get \n\t4. remove \n\t5. add \n\t6. toString \n\t7. max \n");

			Scanner sc = new Scanner(System.in);

			List<Integer> mylist = new List<Integer>();
			
			while (true) {
				System.out.print("Сонголт: ");
				int songolt = sc.nextInt();

				switch (songolt) {
				case 1: {
					System.out.println(mylist.isEmpty());
					break;
				}
				//Size
				case 2: {
					System.out.println(mylist.size());
					break;
				}
				case 3: {
				// get()
					System.out.print("Хайх элементийн индекс: ");
					int index = sc.nextInt();
					if (index < mylist.size())
						System.out.println(mylist.get(index));
					else
						System.out.println(index + " гэсэн индекс дээр утга хадгалагдаагүй.");
					break;
				}
				//remove 
				case 4:{
					System.out.print("Устгах элементийн индекс: ");
					int index = sc.nextInt();
					if (index < mylist.size())
						System.out.println(mylist.remove(index) + " элементийг устгалаа.");
					else
						System.out.println("Устгах элемент олдсонгүй.");
					break;
				}
				//Add 
				case 5: {
					System.out.print("Нэмэх элементийн индекс: ");
					int index = sc.nextInt();			
					System.out.println("Нэмэх элемент: ");
					int value = sc.nextInt();
					mylist.add(index, value);

					break;
				}
				//toString
				case 6: {
					System.out.println(mylist.toString());
					break;
				}
				//Max ...
				case 7: {
					if (mylist.isEmpty())
						System.out.println("Жагсаалт хоосон байна.");
					else
						System.out.println(mylist.max());
					break;
				}

				}
			}
		}
		//aa
	}


