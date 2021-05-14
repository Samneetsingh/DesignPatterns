package behavioral.state

class DirectionService(var travelMode: TravelMode) {

  def getEta: String = this.travelMode.getETA

  def getDirection: String = this.travelMode.getDirection

  def getTravelMode: TravelMode = this.travelMode

  def setTravelMode(travelMode: TravelMode): Unit = this.travelMode = travelMode

}
