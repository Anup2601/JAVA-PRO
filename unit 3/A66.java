// sealed class 
sealed class Vehicle permits car,bike,scooter{

}
final class car extends Vehicle{

}
sealed class bike extends Vehicle permits sportbike,simple{

}
non-sealed class scooter extends Vehicle{

}
final class sportbike extends bike{

}
final class simple extends bike{

}
class A66{
    public static void main(String[] args) {
        
    }
}