package hu.hungerit.singletonapp.singletons;

public class TestSingleton
{
    // region Singleton
    private static TestSingleton instance;

    public static synchronized TestSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new TestSingleton();
        }

        return instance;
    }
    // endregion

    // region Private fields
    private String data1;
    // endregion

    // region Private constructor
    private TestSingleton()
    {
    }
    // endregion

    // region Getters and Setters
    public String getData1()
    {
        return data1;
    }

    public void setData1(String data1)
    {
        this.data1 = data1;
    }
    // endregion
}
