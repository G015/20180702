
public class CallMethodExample2 {

	public static void main(String[] args) {
		System.out.println("これからmethodAを呼び出します");
		methodA();
		System.out.println("methodAの呼び出しが終わりました");

	}


	public static void methodA() {
		System.out.println("methodAの内部の命令文です");
	}

}
