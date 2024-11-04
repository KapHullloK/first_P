public abstract class Transport {
    protected String modelName;
    protected int wheelsCount;

    public abstract void updateTyre();

    public abstract String getModelName();

    public abstract void setModelName(String modelName);

    public abstract int getWheelsCount();

    public abstract void setWheelsCount(int wheelsCount);
}
