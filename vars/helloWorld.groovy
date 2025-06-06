def call(body) {
  def mapVars = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = mapVars
  body()

  def name = mapVars.name
  def action = mapVars.action

  echo "${action} ${name}!!"
}
