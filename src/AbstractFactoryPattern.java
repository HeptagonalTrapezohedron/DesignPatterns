/*
 * 抽象工廠方法模式
 */
public class AbstractFactoryPattern {
	public static void main(String[] args) {
	    SampleFactory factory = new OneFactory(); 
		factory.CreateProductA();
		factory.CreateProductB();
    }
}

abstract class SampleProduct{}

class ProductC extends SampleProduct{
	 public ProductC() {
		 System.out.println("生成物件類型A");
    }
}

class ProductD extends SampleProduct{
	 public ProductD() {
		 System.out.println("生成物件類型B");
    }
}

interface SampleFactory {
	ProductC CreateProductA();
	ProductD CreateProductB();
}



class OneFactory implements SampleFactory{

	public OneFactory() {
		 System.out.println("工廠產生");
    }

	@Override
	public ProductC CreateProductA() {
		return new ProductC();
	}

	@Override
	public ProductD CreateProductB() {
		return new ProductD();
	}
}

