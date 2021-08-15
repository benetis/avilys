@main def hello: Unit = 
  println("Hello world!")

enum HomeAccessory:
  case AutomaticFrontGates extends HomeAccessory
  case FrontCamera extends HomeAccessory
  case GateDoorbell extends HomeAccessory
  case SmartLight(light: Light) extends HomeAccessory
end HomeAccessory

enum Light:
  case LightByTimer extends Light
  case LightByEvent extends Light
end Light