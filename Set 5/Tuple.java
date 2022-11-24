class Tuple <T,U>
{
    public T _1;
    public U _2;
    Tuple(T t, U u)
    {
      this._1=t;
      this._2=u;
    }
}
class DonutShop
{
    public static Tuple<Donut,Payment> buyDonut(CreditCard creditCard)
    {
        Donut donut =new Donut();
        Payment payment=new Payment(creditCard, Donut.price);
        return new Tuple<>(donut, payment);
    }
}