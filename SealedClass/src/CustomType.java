public abstract sealed class CustomType permits CustomNumber, CustomBoolean, CustomCharacter
{
    String name;

    public CustomType(String name)
    {
        this.name = name;
    }
}
