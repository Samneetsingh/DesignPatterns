package behavioral.state

import behavioral.state.modes.{DriveMode, WalkMode}

object State {
  def main(args: Array[String]): Unit = {
    val driveMode = new DriveMode()
    val service = new DirectionService(driveMode)
    println(service.getEta)
    println(service.getDirection)

    val walkMode = new WalkMode()
    service.setTravelMode(walkMode)
    println(service.getEta)
    println(service.getDirection)
  }
}
