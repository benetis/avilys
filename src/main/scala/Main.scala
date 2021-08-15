@main def hello: Unit = 
  println("Hello world!")

//enum Light:
//  case LightByTimer extends Light
//  case LightByEvent(event: Event) extends Light
//end Light

case class Zone(name: String)

enum Observer:
  case PullObserver extends Observer
  case PushObserver extends Observer
end Observer


//case class Device(name: String, homeAccessory: HomeAccessory)
//
//enum Event:
//  case GatesEvent extends Event
//end Event
//
//val myDevice = Device("hello lamp",
//  HomeAccessory.SmartLight(Light.LightByEvent()
//  )
//)