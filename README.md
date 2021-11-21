# Car Store
It is a program where you can choose a car and check it in the basket.

# Team
Malikov Alan, Asanuly Alikhan - Group SE2008

# Patterns

Our code uses 5 patterns:

# Abstract Factory:

Role: we used that pattern to divide cars by brand and after execution, it will write the main feature and country of the brand.

It uses:

BMWAttributesFactory, BMWCountry(), BMWFeatures(), TeslaAttributesFactory, TeslaCountry(), TeslaFeatures(), ToyotaAttributesFactory, ToyotaCountry(), ToyotaFeatures() classes

CarAttributesFactory, CarCountry, CarFeatures  interfaces.

# Strategy:

Role: this pattern works as dividing cars by type: Truck, Electric car and Passenger car.

it uses:

PassengerCar, PassengerCarProperty, Truck, TruckProperty, ElectroCar, ElectroCarProperty classes and CarType abstract class.

CarTypeProperty interface.

# Decorator:

Role: we used this template to choose a complete set for the car: custom or suit.

It uses:

MetalDiscs, SteelDiscs, CustomSalon, LeatherSalon, ToyotaElectric, ToyotaTruck, ToyotaPassenger, TeslaElectric, TeslaPassenger, TeslaTruck, BMWElectric, BMWPassenger, BMWTruck  classes and Decorator abstract class.

CarCreation interface.

# Observer:

Role: we used it to notify and show the user a car that he\she choose when clicking on the 'basket' option after choosing a car.

It uses: 

Client, Basket classes

Observer, Observable interfaces.

# Bridge:

Role: it divides all code into several commands. Our main menu consisted of 3 command classes: ChooseCar, BasketCommand and Exit.

It uses:

Exit, BasketCommand, Command, ChooseCar classes and CommandAbstract abstract class

CommandInterface interface.
# Test

It gives menu where you can choose. For example:

```bush
Choose options:
 1.Order car
 2.Basket
 3.Exit
1
Choose brand of car
1.Toyota
2.Tesla
3.BMW
Put any number to return to main menu
1
This car was produced in Japan.
They produce one of the reliable cars in the world.
Choose type of car
1.Truck
2.Passenger Car
3.Electric car
Put any number to return to main menu
2
It's a passenger car...
This type is only for driving in cities and for daily use.
Choose equipment to truck:
1.Custom
2.Suit
Put any number to return to main menu
2
Steel discs was equipped
Leather salon was equipped
Saved in Basket...
Choose options:
 1.Order car
 2.Basket
 3.Exit
2
Hello dear customer! This is your basket right now![
Toyota Camry
Model:50
Year:2021
Discs:Steel
Salon:Leather
, 
Price of the car:35345.0 usd]
Choose options:
 1.Order car
 2.Basket
 3.Exit
3
Bye!

Process finished with exit code 0

```

## License
[MIT](https://choosealicense.com/licenses/mit/)
