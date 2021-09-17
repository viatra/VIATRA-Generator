declare module '*.module.scss' {
  const cssVariables: { [key in string]?: string };
  // eslint-disable-next-line import/no-default-export
  export default cssVariables;
}
