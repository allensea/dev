# kubernetes

## Attach debug container to pod
```
kubectl debug pod_name_to_debug -it --image=debug/image -- /bin/sh
```

## Container requiring mlock
Encountered when running Varnish in Kubernetes.  It requires that locks memory with `mlock()` but a ulimit was too low.

Use setcap on entrypoint of container:
```
FROM alpine

USER root
RUN apt update && apt install -y libcap2-bin && apt clean \
    && setcap cap_ipc_lock=+ep /path/to/binary
USER notroot
```

Grant capability to container:
```
capabilities:
    - IPC_LOCK
```