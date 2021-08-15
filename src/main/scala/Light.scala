case class SmartLight() extends HomeAccessory

object SmartLight {
  enum LightState:
    case LightOn extends LightState
    case LightOff extends LightState
  end LightState

  enum LightEvent:
    case ObservedLightState(lightState: LightState) extends LightEvent
    case LightPushedState(lightState: LightState) extends LightEvent
  end LightEvent
}
