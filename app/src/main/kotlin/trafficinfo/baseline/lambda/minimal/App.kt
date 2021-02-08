package trafficinfo.baseline.lambda.minimal

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import kotlinx.datetime.Clock

class App : RequestHandler<HandlerInput, HandlerOutput> {
  override fun handleRequest(input: HandlerInput?, context: Context?): HandlerOutput {
    var currentMoment = Clock.System.now()
    when (input?.key.equals("time")) {
      true -> {
        return HandlerOutput("time", currentMoment.toString())
      }
      else -> {
        return HandlerOutput("", "key 'time' must be set")
      }
    }
  }
}
