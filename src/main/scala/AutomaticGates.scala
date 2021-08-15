
case class AutomaticGates() extends HomeAccessory

object AutomaticGates {

  enum GatesState:
    case GatesOpen extends GatesState
    case GatesClosed extends GatesState
  end GatesState

  enum GatesEvent:
    case ObservedGatesState(gatesState: GatesState) extends GatesEvent
    case GatesPushStateEvent(gatesState: GatesState) extends GatesEvent
  end GatesEvent

}
