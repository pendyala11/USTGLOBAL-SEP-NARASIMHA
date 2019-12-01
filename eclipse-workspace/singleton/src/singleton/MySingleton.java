package singleton;

public class MySingleton {
private static MySingleton instance = null;

private MySingleton() {
	
}

public static MySingleton getDbConnection() {
	if(instance == null) {
		instance = new MySingleton();
		return instance;
	}
	else
	{
		return instance;
	}
}
}
