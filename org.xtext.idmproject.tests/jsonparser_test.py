import json
with open("file.json") as f:
 data = json.load(f)
with open("newFile.json", 'w') as newFile:
 json.dump(data, newFile)