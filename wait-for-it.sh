#!/bin/sh

set -e

host="$1"
port="$2"
shift 2
cmd="$@"

# Wait for the dependency to be ready on localhost and port
until nc -z -w 1 "$host" "$port"; do
  echo "Waiting for $host:$port to be ready..."
  sleep 1
done

>&2 echo "$host:$port is ready - executing command"
exec $cmd