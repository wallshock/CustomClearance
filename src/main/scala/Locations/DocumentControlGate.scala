package Locations

import Traits.TruckLogic.Truck
import Traits.{ControlGate, Location}

class DocumentControlGate extends ControlGate, Location {
  override def getLocation: String = "DocumentControlGate"

  override def checkTruck(truck: Truck): Boolean = {
    truck.weight != 66 //sample condition to test
  }
  
  override def logEntry(truck: Truck): Unit = {
    println(s"Truck ${truck.licensePlate} entered the gate $getLocation at ${java.time.LocalDateTime.now}")
  }

  override def logExit(truck: Truck): Unit = {
    println(s"Truck ${truck.licensePlate} exited the gate $getLocation at ${java.time.LocalDateTime.now}")
  }
}
