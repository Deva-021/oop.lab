 abstract class DataFlow {

    public final void executeFlow() {
        fetchData();
        verifyData();
        storeData();
    }

    protected abstract void fetchData();
    protected abstract void verifyData();
    protected abstract void storeData();
}

 class LocalDataFlow extends DataFlow {

    @Override
    protected void fetchData() {
        System.out.println("Fetching local data...");
    }

    @Override
    protected void verifyData() {
        System.out.println("Verifying local data...");
    }

    @Override
    protected void storeData() {
        System.out.println("Storing local data...");
    }
}

 class RemoteDataFlow extends DataFlow {

    @Override
    protected void fetchData() {
        System.out.println("Fetching remote data...");
    }

    @Override
    protected void verifyData() {
        System.out.println("Verifying remote data...");
    }

    @Override
    protected void storeData() {
        System.out.println("Storing remote data...");
    }
}

public class DataFlowManager {
    public static void main(String[] args) {
        DataFlow localFlow = new LocalDataFlow();
        localFlow.executeFlow();

        DataFlow remoteFlow = new RemoteDataFlow();
        remoteFlow.executeFlow();
    }
}