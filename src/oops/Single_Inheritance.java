package oops;

public class Single_Inheritance {
	
	 static class Animal {
	        String color;

	        public void eat() {
	            System.out.println("Animal is eating...");
	        }
	    }

	    static class Dog extends Animal {
	        String breed = "Pug";

	        public void bark() {
	            System.out.println("Dog is barking...");
	        }
	    }

	    public static void main(String[] args) {
	        Dog ob = new Dog();

	        ob.color = "Black";

	        System.out.println("Breed = " + ob.breed);
	        System.out.println("Color = " + ob.color);

	        ob.bark();
	        ob.eat();

		}

	}


