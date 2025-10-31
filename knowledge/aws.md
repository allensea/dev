# AWS

## Read AWS SSO CLI cached credentials for use with Terraform
```
# ~/.aws/config

[profile terraform]
credential_process = sh -c "ls -t ~/.aws/cli/cache/*.json | head -n1 | xargs cat | jq -r '.Credentials + {Version: 1}'"
```
