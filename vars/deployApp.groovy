def call(body) {
  def cfg = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = cfg
  body()

  def env = cfg.environment ?: 'dev'
  def version = cfg.version ?: 'latest'
  def dryRun = cfg.dryRun ?: false

  echo "Deploying version ${version} to ${env} (dryRun: ${dryRun})"
}
