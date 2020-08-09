package me.sakigamiyang.aquarius.statemachine.impl

import me.sakigamiyang.aquarius.statemachine.State

import scala.collection.concurrent

object StateHelper {
  def getState[S, E, C](stateMap: concurrent.Map[S, State[S, E, C]], stateId: S): State[S, E, C] =
    stateMap.getOrElseUpdate(stateId, new StateImpl(stateId))
}
